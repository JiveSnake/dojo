require 'minitest/autorun'
require_relative '../../lib/datastructures/queue'
 
class TestQueue < Minitest::Test
  def setup
    @queue = Queue.new
  end

  def test_enqueue
    @queue.enqueue(1)
    assert_equal @queue.store, [1]
  end

  def test_dequeue
    @queue.enqueue(1)
    assert_equal @queue.store, [1]

    @queue.dequeue
    assert_equal @queue.store, []
  end
end
