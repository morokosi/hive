<?php
namespace metastore;

/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class Type
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'name',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'type1',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        3 => array(
            'var' => 'type2',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        4 => array(
            'var' => 'fields',
            'isRequired' => false,
            'type' => TType::LST,
            'etype' => TType::STRUCT,
            'elem' => array(
                'type' => TType::STRUCT,
                'class' => '\metastore\FieldSchema',
                ),
        ),
    );

    /**
     * @var string
     */
    public $name = null;
    /**
     * @var string
     */
    public $type1 = null;
    /**
     * @var string
     */
    public $type2 = null;
    /**
     * @var \metastore\FieldSchema[]
     */
    public $fields = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['name'])) {
                $this->name = $vals['name'];
            }
            if (isset($vals['type1'])) {
                $this->type1 = $vals['type1'];
            }
            if (isset($vals['type2'])) {
                $this->type2 = $vals['type2'];
            }
            if (isset($vals['fields'])) {
                $this->fields = $vals['fields'];
            }
        }
    }

    public function getName()
    {
        return 'Type';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->name);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->type1);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->type2);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::LST) {
                        $this->fields = array();
                        $_size42 = 0;
                        $_etype45 = 0;
                        $xfer += $input->readListBegin($_etype45, $_size42);
                        for ($_i46 = 0; $_i46 < $_size42; ++$_i46) {
                            $elem47 = null;
                            $elem47 = new \metastore\FieldSchema();
                            $xfer += $elem47->read($input);
                            $this->fields []= $elem47;
                        }
                        $xfer += $input->readListEnd();
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('Type');
        if ($this->name !== null) {
            $xfer += $output->writeFieldBegin('name', TType::STRING, 1);
            $xfer += $output->writeString($this->name);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->type1 !== null) {
            $xfer += $output->writeFieldBegin('type1', TType::STRING, 2);
            $xfer += $output->writeString($this->type1);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->type2 !== null) {
            $xfer += $output->writeFieldBegin('type2', TType::STRING, 3);
            $xfer += $output->writeString($this->type2);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->fields !== null) {
            if (!is_array($this->fields)) {
                throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
            }
            $xfer += $output->writeFieldBegin('fields', TType::LST, 4);
            $output->writeListBegin(TType::STRUCT, count($this->fields));
            foreach ($this->fields as $iter48) {
                $xfer += $iter48->write($output);
            }
            $output->writeListEnd();
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
